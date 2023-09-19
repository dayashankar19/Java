var students = [
    { name: 'John', age: 20, grade: 'A' },
    { name: 'Jane', age: 19, grade: 'B' },
    { name: 'Alex', age: 21, grade: 'A-' }
  ];
  
  function manipulateStudentRecord(operation, attributeName, value) {
    // Check if the operation is 'delete'
    if (operation === 'delete') {
      for (var i = 0; i < students.length; i++) {
        delete students[i][attributeName];
      }
    }
  
    // Check if the operation is 'edit'
    if (operation === 'edit') {
      for (var i = 0; i < students.length; i++) {
        students[i][attributeName] = value;
      }
    }
  }
  console.log('Before manipulation:', students);
  
  manipulateStudentRecord('delete', 'grade');
  console.log('After delete operation:', students);
  
  manipulateStudentRecord('edit', 'age', 22);
  console.log('After edit operation:', students);
  