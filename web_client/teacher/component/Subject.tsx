import React, { useContext } from 'react'
import { TeacherContext } from '../context/TeacherContext'

const Subject = ({ subject }: any) => {
  const { getFormAndArm }: any = useContext(TeacherContext)
  return (
    <>
      <button onClick={() => getFormAndArm(subject.id)}>subject.name</button>
    </>
  )
}
export default Subject
