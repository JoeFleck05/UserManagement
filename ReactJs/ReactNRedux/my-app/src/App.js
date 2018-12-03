import React, { Component } from 'react';
import logo from './logo.svg';
import JNFDesign from './JNFDesignsLogo2.PNG';
import './App.css';

const alignLeft = {
	alignItems: 'left',
	display: 'flex',
};

class App extends Component {
  render() {
    return (
		<div className="App">
			<header className="App-header">
				<div className="JNF" >
					<img src={JNFDesign} className="JNFDesign" alt="JNFDesignLogo" style={alignLeft}/>
				</div>
			</header>
			// <header className="App-header">
			// 	<img src={logo} className="App-logo" alt="logo" />
			// 	<h1 className="App-title">Welcome to React</h1>
			// </header>
			// <p className="App-intro">
// 				To get started, edit <code>src/App.js</code> and save to reload.
// 			</p>
		</div>
    );
  }
}

export default App;
