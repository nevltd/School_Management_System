import { useContext, useEffect, useState } from 'react'
import React from 'react'
import axios from 'axios'
import Subject from './Subject'
import { TeacherContext } from '../context/TeacherContext'


const SubjectsITeach = (): any => {
  const { teacherId }: any = useContext(TeacherContext)
  const [subjects, setSubjects] = useState([])
  useEffect(() => {
    const { initSubjects }: any = axios.get(`subjects/${teacherId}`)
    setSubjects(initSubjects)
  })
  return (
    <>
      {subjects.map((subject) => {
        ;<Subject key={subject.id} subject={subject} />
      })}
    </>
  )
}
export default SubjectsITeach
