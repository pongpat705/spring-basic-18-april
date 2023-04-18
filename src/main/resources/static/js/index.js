window.addEventListener('load', init(), false );
function init() {
    getData();
}

function getData(){

const data = {status: 200,
                     message : "insert data",
                     data: {
                             name:"mao",
                             age:10
                             }
             };
fetch("/app/api/v5/profile", {
// fetch("/app/api/v4/profile/test/10", {
//    fetch("/app/api/v3/profile?name=test&age=10", {
      method: "POST", // or 'PUT'
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data)
    }).then((response) => {
        return response.json()
    }).then((data) => {
        console.log("Success:", data);
        let element = document.getElementById("data");
        element.innerText = 'Hello '+data.data.name;
    }).catch((error) => {
        console.error("Error:", error);
    });

}