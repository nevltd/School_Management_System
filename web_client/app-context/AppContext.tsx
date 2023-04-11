import React from 'react'
import { useState, createContext } from 'react'

export const AppContext = createContext({})
const AppProvider = ({ children }: any): any => {
  const [roles, setRoles] = useState([])

  return (
    <AppContext.Provider value={{ roles, setRoles }}>
      {children}
    </AppContext.Provider>
  )
}
export default AppProvider
