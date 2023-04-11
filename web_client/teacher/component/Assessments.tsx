import axios from 'axios'
import React, { useContext, useEffect, useState } from 'react'
import { TeacherContext } from './context/TeacherContext'
import Assessment from './record_assessment/Assessment'
const Assessments = () => {
  const { subjectId, formId, armId }: any = useContext(TeacherContext)
  const [standardAssessments, setStandardAssessments] = useState([])
  const [teacherAssessments, setTeacherAssessments] = useState([])
  useEffect(() => {
    const { initStandardAssessments }: any = axios.get(
      `/${subjectId}/${formId}/`
    )
    const { initTeacherAssessments }: any = axios.get(
      `/${subjectId}/${formId}/${armId}`
    )
    setStandardAssessments(initStandardAssessments)
    setTeacherAssessments(initTeacherAssessments)
  })
  return (
    <>
      <div>standard assessment</div>
      {standardAssessments.map((assessment) => {
        ;<Assessment key={assessment.id} assessment={assessment} />
      })}
      <div>teacher defined assessment</div>
      {teacherAssessments.map((assessment) => {
        ;<Assessment key={assessment.id} assessment={assessment} />
      })}
    </>
  )
}
export default Assessments
