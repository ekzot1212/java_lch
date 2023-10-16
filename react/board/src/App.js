import { BrowserRouter, Routes, Route, Link, useLocation, useNavigate } from "react-router-dom";
import {useState} from 'react'

function App() {
  let [list, setList] = useState([{
    id : 1,
    writer : 'Movie1',
    message : 'Drama',
    writeDate : '2022-01-01'
  },{
    id : 2,
    writer : 'Movie2',
    message : 'Action',
    writeDate : '2022-01-02'
  }
]);

  const deleteBoard = (id)=>{
    let tmpList = list.filter(item=>item.id != id);
    setList(tmpList);
  }
  const addBoard = (board)=>{
    setList([board, ...list]);
  }
  return (
    <BrowserRouter>
      <Header/>
      <Routes>
        <Route path="/" exact element={<Home list={list} deleteBoard={deleteBoard} add={addBoard} />} />
        <Route path='/insert' element={<Insert/>}/>
      </Routes>
    </BrowserRouter>
  );
}

function Header(){
	return(
		<header className='menu'>
			<ul className='menu-list'>
				<li className='menu-item'>
					<Link to="/" className='menu-link'>List</Link>
				</li>
				<li className='menu-item'>
					<Link to="/insert" className='menu-link'>Add New Message</Link>
				</li>
			</ul>
		</header>
	)
}

function Home({list, deleteBoard, add}){
	const location = useLocation();
	let board = location.state;
	if(board != null){
		add(board);
		location.state = null;
	}
	return(
		<main>
      <h1>Messages</h1>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Writer</th>
						<th>Message</th>
						<th>Write Date</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					{list.length == 0 ? 
						<tr><th colSpan={4}><h1>등록된 메세지가 없습니다.</h1></th></tr> :
						list.map(item=>{
							return(
								<tr key={item.id}>
                  <td>{item.id}</td>
									<td>{item.writer}</td>
									<td>{item.message}</td>
									<td>{item.writeDate}</td>
									<td><button onClick={()=>{deleteBoard(item.id)}}>삭제</button></td>
								</tr>
							)
						})
					}
				</tbody>
			</table>
		</main>
	)
}

function Insert(){
	const navigate = useNavigate();
	const [id, setId] = useState(1);
	const [writer, setWriter] = useState('');
	const [message, setMessage] = useState('');
  const [writeDate, setWriteDate] = useState('');

	const idChange = e => setId(e.target.value);
	const writerChange = e => setWriter(e.target.value);
	const messageChange = e => setMessage(e.target.value);
	const writeDateChange = e => setWriteDate(e.target.value);

	const insertBoard = ()=>{
		navigate('/',{
			state : {
				id : id,
        writer : writer,
				message : message,
				writeDate : writeDate
			}
		})
	}

	return(
		<form>
      <h1>Create Message</h1>
			<input type="number" placeholder="Input message id" onChange={idChange} value={id} required/>
				<br/>
				<input type="text" placeholder="Input message writer" onChange={writerChange} value={writer} required/>
				<br/>
				<input type="text" placeholder="Input message content" onChange={messageChange} value={message} required/>
				<br/>
				<input type="date" onChange={writeDateChange} value={writeDate} required/>
				<br/>
				<button onClick={insertBoard}>Add Message</button>
		</form>
	)
}

export default App;
