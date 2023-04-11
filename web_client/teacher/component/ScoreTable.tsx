import React, { useContext, useEffect } from 'react'
import { TeacherContext } from '../context/TeacherContext'
import Loader from '../../components/Loader'
const SingleRow = ({ score }: any): JSX.Element => {
  const { changeScore }: any = useContext(TeacherContext)
  return (
    <>
      <tr>
        <td>{score.lastName}</td>
        <td>{score.firstName}</td>
        <td>
          <input
            name="score"
            onChange={(e: React.FormEvent<HTMLInputElement>) =>
              changeScore(e, score.id)
            }
            value={score.score}
          />
        </td>
      </tr>
    </>
  )
}
const AllRows = (): JSX.Element => {
  const { scoresToBeViewed }: any = useContext(TeacherContext)
  return (
    <>
      {scoresToBeViewed.map((score) => (
        <SingleRow key={score.id} score={score} />
      ))}
    </>
  )
}
const Table = (): any => {
  const { addPage }: any = useContext(TeacherContext)

  return (
    <>
      <table>
        <thead>
          <tr>
            <th>LastName</th>
            <th>FirstName</th>
            <th>Score</th>
          </tr>
        </thead>
        <tbody>
          <AllRows />
        </tbody>
      </table>
      <button onClick={addPage}>ADD</button>
    </>
  )
}
const ScoreTable = (): JSX.Element => {
  const { scoreTableLoading, initScores }: any = useContext(TeacherContext)
  useEffect(initScores('firstname'))
  return <>{scoreTableLoading ? <Loader /> : <Table />}</>
}
export default ScoreTable
