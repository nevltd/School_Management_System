import React from 'react'
import { useHistory } from 'react-router-dom'
import { Button } from '@material-ui/core'

const TeacherHome = (): JSX.Element => {
  const history = useHistory()
  return (
    <>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/subjects-i-teach')}
      >
        Subjects I teach
      </Button>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/teacher-timetable')}
      >
        Timetable
      </Button>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/teacher-assessments')}
      >
        Assessments
      </Button>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/teacher-messages')}
      >
        Messages
      </Button>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/teacher-notifications')}
      >
        Notifications
      </Button>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/teacher-library')}
      >
        Library
      </Button>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/teacher-events')}
      >
        Events
      </Button>
      <Button
        className="teacherHomeElement"
        onClick={() => history.push('/upload-learning-materials')}
      >
        Upload Learning Material
      </Button>
    </>
  )
}
export default TeacherHome
