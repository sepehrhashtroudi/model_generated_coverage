var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":108,"id":4886,"methods":[{"el":45,"sc":3,"sl":41},{"el":59,"sc":1,"sl":48},{"el":71,"sc":1,"sl":62},{"el":82,"sc":1,"sl":74}],"name":"CircularReferenceTest","sl":38},{"el":98,"id":4911,"methods":[],"name":"CircularReferenceTest.ContainsReferenceToSelfType","sl":96},{"el":102,"id":4911,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReference","sl":100},{"el":107,"id":4911,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReferenceArray","sl":104}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_127":{"methods":[{"sl":48}],"name":"testCircularSerialization7","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":57}]},"test_131":{"methods":[{"sl":62}],"name":"testSelfReferenceArrayFieldSerialization10","pass":true,"statements":[{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":69}]},"test_27":{"methods":[{"sl":74}],"name":"testSelfReferenceSerialization12","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77},{"sl":78}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [127], [127], [127], [127], [127], [127], [127], [], [], [127], [], [], [], [], [131], [131], [131], [131], [131], [], [], [131], [], [], [], [], [27], [27], [27], [27], [27], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
