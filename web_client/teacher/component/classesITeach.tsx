import React, { useContext } from 'react'
import { TeacherContext } from './context/TeacherContext'
import Form from './Form'
import Arm from './Arm'

const ClassesITeach = () => {
  const { formsAndArms }: any = useContext(TeacherContext)

  return (
    <>
      {formsAndArms.map((form) => {
        <Form key={form.id} form={form.id} />
        form.arms.map((arm) => {
        <Arm key={arm.id} arm={arm} formId ={form.id}/>
        })
      })}
    </>
  )
}
export default ClassesITeach
