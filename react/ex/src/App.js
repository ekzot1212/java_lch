import { useState } from "react";
import Btn from "./Btn";
import Input from "./Input";
import Main from "./Main";
import Login from "./Login";
import {Routes, Route, Link} from 'react-router-dom';

function App() {
  let [count, setCount] = useState(0);
  let [text, setText] = useState('');
  let [display, setDisplay] = useState('');

  const clickEvent1 = () => {
    alert('클릭');
    console.log(++count);
  }
  const consoleEvent = (text) => {
    console.log(text);
    console.log(++count);
  }
  const inputChange = (e) => {
    setText(e.target.value);
  }
  console.log('input : ', text);

  return (
    <div>
      <Btn text='버튼1' event={clickEvent1}/>
      <Btn text='버튼2' event={() => {console.log('클릭'); count++; console.log(count); }}/>
      <Btn text='버튼3' event={ () =>consoleEvent(1)}/>
      <Input inputEvent={inputChange} />
      <Btn text="클릭" event={() => setDisplay(text)}/>
      <h1>{display}</h1>
      <ul>
        <li>
          <Link to="/">홈</Link>
        </li>
        <li>
          <Link to="/login">로그인</Link>
        </li>
      </ul>
      <Routes>
        {/* 해당 url일 때 어떤 컴포넌트를 불러올지 */}
        <Route path="/" exact element={<Main/>} />
        <Route path="/login" exact element={<Login/>} />
      </Routes>
    </div>
  );
}



export default App;
