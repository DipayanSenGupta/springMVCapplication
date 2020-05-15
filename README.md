# Employee Creation through API

- localhost:9091/employees (GET)

(Response)

[]
  -200 OK
- localhost:9091/employees (POST)

(Body)
    {
        "empName": "Dipayan",
        "deptName": "ITDD"
    }
  -200 OK

- localhost:9091/employees (GET)

(Response)
[
    {
        "empId"  : 1,
        "empName": "Dipayan",
        "deptName": "ITDD"
    }
 ]
  -200 OK
 
 # Role Assignment to Employee
 
 - localhost:9091/employees/1/roles   (GET)

(Response)
[]
  -200 OK

- localhost:9091/employees/1/roles   (POST)

(Body)
 {
        "roleId": 1006,
        "roleName": "Development"
    }
    -200 OK
 
 - localhost:9091/employees/1/roles   (GET)
 
 (Response)   
    [
    {
        "employee": {
            "empId": 1,
            "empName": "Dipayan",
            "deptName": "ITDD"
        },
        "roleId": 1006,
        "roleName": "Development"
    }
]
  -200 OK
  
 - localhost:9091/employees/1/roles/1006   (PUT)
 
 (Body)
    {
        "roleId": 1006,
        "roleName": "Security"
    }
  -200 OK
  
  - localhost:9091/employees/1/roles   (GET)

  (Response)
    [
    {
        "employee": {
            "empId": 1,
            "empName": "Dipayan",
            "deptName": "ITDD"
        },
        "roleId": 1006,
        "roleName": "Security"
    }
]
  -200 OK
