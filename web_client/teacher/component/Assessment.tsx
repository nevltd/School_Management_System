import React, { useContext } from 'react'
import { TeacherContext } from '../context/TeacherContext'

const Assessment = ({ assessment }: any) => {
  const { setUpAssessment }: any = useContext(TeacherContext)
  return (
    <>
      <button onClick={() => setUpAssessment(assessment.id)}>
        {assessment.name}
      </button>
    </>
  )
}
export default Assessment
