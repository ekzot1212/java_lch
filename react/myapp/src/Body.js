// import './css/App.css';
import { useState } from "react";
import ContentsA from "./ContentsA";
import ContentsB from "./ContentB";
import Box from "./Box";

function Body(){

	return(
		<div className="body">
			<Box className="left" maxPage={13} Contents={ContentsA}/>
			<Box className="right" maxPage={6} Contents={ContentsB}/>
		</div>
	)
}


export default Body;