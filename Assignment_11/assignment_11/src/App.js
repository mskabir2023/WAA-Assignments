//import './App.css';

import React, { Component } from 'react';
import Counter from './component/Counter';
import Colors from './component/Colors';
import { BrowserRouter as Router, Route, Link, Routes } from 'react-router-dom';
import FocusInput from "./component/FocusInput";
class App extends Component {
  render() {
    return (


        <Router>
            <Routes>

                <Route path="/" exact element={<Counter/>} />
                <Route path="/colors" element={<Colors/>} />
                <Route path="/focus" element={<FocusInput/>} />

                </Routes>

        </Router>
    );
  }
}

export default App;
