import React from 'react'
import { BrowserRouter, Switch, Route } from 'react-router-dom'

import NavBar from './navbar/NavBar'
import Home from './home/Home'
//import ScoresProvider from './teacher/context/TeacherContext'
//import AppProvider from './app-context/AppContext'
//import RecordAssessmentScore from './pages/teacher/RecordAssementScore'
//import ScoreTable from './components/teacher/record_assessment/ScoreTable'
const App: React.FC = () => {
  return (
    //<AppProvider>
    //<ScoresProvider>
    <BrowserRouter>
      <NavBar />
      <div className="container">
        <Switch>
          <Route path="/" component={Home} />
        </Switch>
      </div>
    </BrowserRouter>
    // </ScoresProvider>
    //</AppProvider>
  )
}

export default App
