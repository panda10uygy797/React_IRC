import React from 'react';
import { useNavigate } from 'react-router-dom';
import './Register.css';
const Register = () =>
{
    const navigate = useNavigate();
    const handleSubmit = ()=>{
        console.log("Registration Successful.");
        navigate('/');
    }
    return(
        <div className="reg">
            <form onSubmit={handleSubmit}>
                <h2>Sign-Up</h2>
                <input type="textarea" placeholder="First Name" required></input><br/>
                <input type="textarea" placeholder="Last Name" required></input><br/>
                <input type="email" placeholder="Email-ID" required></input><br/>
                <input type="password" placeholder="Password"required></input><br/>
                <input type="password" placeholder="Confirm Password"required></input><br/>
                <input type="submit" value="Register"/>
            </form>
        </div>
    )
}

export default Register;