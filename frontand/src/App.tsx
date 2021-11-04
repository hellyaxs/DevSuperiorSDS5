import NavBar from 'components/NavBar';
import Footer from 'components/Footer';
import DataTable from 'components/DataTable';

function App() {
  return (
    <>
      <NavBar />
      <div className="App">
        
        <div className="container">
        <h1 className="text-primary">hello word</h1>
          <DataTable />
        </div>
      </div>
      <Footer />
    </>
  );
}

export default App;
