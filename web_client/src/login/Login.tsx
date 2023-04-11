import React from 'react'
import { useState } from 'react'
import axios from 'axios'
import { FormGroup, Button } from '@material-ui/core'
import { useHistory } from 'react-router-dom'

const Login = (): JSX.Element => {
  const initLoginDetails = {
    loginDetails: String,
    password: String,
  }
  const history = useHistory()
  const [loginDetails, setLoginDetails] = useState(initLoginDetails)

  const login = async () => {
    const response: any = await axios.post('/login', loginDetails)
    const token: any = response.data.token
    if (token) {
      history.push('/app-home')
    }
  }
  const handleChange = (e: React.FormEvent<HTMLInputElement>): void => {
    const target = e.target as HTMLTextAreaElement
    setLoginDetails({ ...loginDetails, [target.name]: target.value })
  }
  return (
    <>
      <FormGroup>
        <label>phone number, email or registration number</label>
        <input
          type="text"
          onChange={(e: React.FormEvent<HTMLInputElement>) => handleChange(e)}
        />
        <label>password</label>
        <input
          type="text"
          name="username"
          onChange={(e: React.FormEvent<HTMLInputElement>) => handleChange(e)}
        />
        <Button onClick={login}>Login</Button>
      </FormGroup>
    </>
  )
}
export default Login
