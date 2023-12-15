import './Login.css';
import { Link } from 'react-router-dom';
function Login()
{
    return(
        <div className="user">
            <form>
                <h2>Login</h2>
                <div>
                <input type="email" placeholder="Email-ID" required></input>
                <br/>
                <input type="password" placeholder="Password"required></input>
                <br/>
                <br/>
                <button type='submit'>Login</button>
                </div>
                <div className='register'>
                <h4>didn't have an account?<Link to='/Register' className='link'>Sign-Up</Link></h4>
                </div>
            </form>
        </div>
    )
}
export default Login;