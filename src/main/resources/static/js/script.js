jsonToTable()
getCustomers()


// create table row for every customer entry here
function jsonToTable() {

    // first parse JSON data
    fetch('http://localhost:8080/customers')
        .then(res => res.json())
        .then(customer => {
            // get data for headers
            // create empty array first then store the first key
            var col = [];
            for (var i = 0; i < customer.length; i++) {
                for (var key in customer[i]) {
                    console.log(key)
                    if (col.indexOf(key) === -1) {
                        col.push(key);
                    }
                }
            }
            var table = document.createElement("table");
            table.className = "table table-striped";
            // this loop is for strictly headers and omitting the first 8 characters
            // of the class properties to make the names meaningful
            var tHeader = [];
            for (var i = 0; i < customer.length; i++) {
                for (var key in customer[i]) {
                    if (tHeader.indexOf(key) === -1) {
                        var header = key.substring(8);
                        tHeader.push(header);
                    }
                }
            }

            var tr = table.insertRow(-1);   // -1 means add new rows from LAST position

            // create table from headers here
            for (var i = 1; i < col.length; i++) {
                var th = document.createElement("th");
                th.className = `scope = "col"`
                th.innerHTML = tHeader[i];
                tr.appendChild(th);
            }

            // for each entry, add as a row
            for (var i = 0; i < customer.length; i++) {
                tr = table.insertRow(-1);
                for (var j = 1; j < col.length; j++) {
                    var tabCell = tr.insertCell(-1);
                    tabCell.innerHTML = customer[i][col[j]];
                }
            }

            // add
            var divContainer = document.getElementById("showData");
            divContainer.innerHTML = "";
            divContainer.appendChild(table);
        })
}
function addCustomer() { //post
    var name = document.getElementById('customerName').value //get value from an html element
    var address = document.getElementById('customerAddress').value
    var phone = document.getElementById('customerPhone').value

    if (name != '' && address != '' && phone != '') {
        fetch('http://localhost:8080/customers', {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({customerName: name, customerAddress: address, customerPhone: phone})

        }).then(res => getCustomers())


        console.log('Added')
    }
}

function getCustomers() {
    jsonToTable()
    var customerList = document.getElementById('customerList')

    customerList.innerHTML = ''

    fetch('http://localhost:8080/customers')
        .then(res => res.json())
        .then(customer => {

            for (i = 0; i < customer.length; i++) {

                var id = customer[i].id

                var deleteLink = `<button onclick='deleteCustomer(${id})'>Delete</button>`

                customerList.innerHTML += '<div>' + customer[i].customerName + `       ` + customer[i].customerAddress + `       ` + customer[i].customerPhone + deleteLink + '</div>'

            }

        })

}


function deleteCustomer(id) {
    fetch('http://localhost:8080/customers/' + id, {
        method: 'delete'
    })
        .then(res => {getCustomers(), jsonToTable()})
}
