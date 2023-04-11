import axios from 'axios'
import React, { useState, createContext } from 'react'

export const TeacherContext = createContext({})
const ScoresProvider = ({ children }: any): any => {
  const initscores: any[] = []
  //const myscores: any[] = []
  //const [armId, setArmId] = useState(0)
  //const [formId, setFormIdd] = useState(0)
  //const [assessmentId, setAssessmentId] = useState(0)
  const [subjectId, setSubjectId] = useState(0)
  //const [teacherId, setTeacherId] = useState(0)
  const [resultCache, setResultCache] = useState(initscores)
  const [allScores, setAllScores] = useState(initscores)
  const [pageNumber, setPageNumber] = useState(1)
  const [formsAndArms, setFormsAndArms] = useState(initscores)
  const [scoreTableLoading, setScoreTableLoading] = useState(true)
  const [numberOfScores, setNumberOfScores] = useState(2)
  const [scoresToBeViewed, setScoresToBeViewed] = useState(
    allScores.slice(0, 2)
  )

  //onChange function
  const changeScore = (
    e: React.FormEvent<HTMLInputElement>,
    id: number
  ): void => {
    const target = e.target as HTMLTextAreaElement
    const newScores: any = scoresToBeViewed.map((score) => {
      if (score.id === id) {
        return { ...score, [target.name]: target.value, saved: true }
      } else {
        return { ...score }
      }
    })
    setScoresToBeViewed(newScores)
  }

  //get the scores to be viewed per page
  const getScoresToBeViewed = (i: number): any => {
    let scoreArray: any[]
    let array
    if (resultCache[i - 1]) {
      scoreArray = resultCache[i - 1]
    } else {
      const start: number = (i - 1) * numberOfScores
      const end: number = start + numberOfScores
      scoreArray = allScores.slice(start, end)
      //this step was carried out to ensure that the cache position is same with the page number
      array = [...resultCache, (resultCache[i - 1] = scoreArray)]
    }
    setPageNumber(i)
    setScoresToBeViewed(scoreArray)
    setResultCache(array)
  }

  //save in batch(separating the already saved or unchanged score)
  const saveInBatch = (): void => {
    let count = scoresToBeViewed.length
    let scoresToBeSaved: any[] = []
    if (count < 1) {
      return
    }
    scoresToBeViewed.map((score) => {
      if (score.saved === true) {
        return { ...score }
      } else {
        scoresToBeSaved.push(score)
        return { ...score, saved: true }
      }
    })
    axios.patch(`${formId}/${armId}/${subjectId}/${assessmentId}/`, {
      body: scoresToBeSaved,
    })
  }

  const addPage = (): any => {
    saveInBatch()
    getScoresToBeViewed(pageNumber + 1)
  }

  const subtractPage = (): void => {
    getScoresToBeViewed(pageNumber - 1)
  }

  const initAndSortScores = async (value: string) => {
    const { rawScores }: any = await axios.get(
      `/${formId}/${armId}/${subjectId}/${assessmentId}`
    )
    const sortedScores = rawScores.sort(({ a, b }: any) => {
      const valueA = a[value].toUpperCase()
      const valueB = b[value].toUpperCase()
      const sortedValue = valueA < valueB ? -1 : 1
      return sortedValue
    })
    setAllScores(sortedScores)
    setScoreTableLoading(false)
  }
  const changeTheNumberOfScoresPerPage = (value: number) => {
    setNumberOfScores(value)
  }
  const getFormAndArm = (id: number) => {
    const { formAndArm }: any = axios.get(`/${teacherId}/${id}`)
    setSubjectId(id)
    setFormsAndArms(formAndArm)
  }

  return (
    <TeacherContext.Provider
      value={{
        allScores,
        scoresToBeViewed,
        setAllScores,
        changeScore,
        setNumberOfScores,
        addPage,
        subtractPage,
        getScoresToBeViewed,
        setScoresToBeViewed,
        scoreTableLoading,
        initAndSortScores,
        changeTheNumberOfScoresPerPage,
        teacherId,
        getFormAndArm,
        formsAndArms,
      }}
    >
      {children}
    </TeacherContext.Provider>
  )
}
export default ScoresProvider
