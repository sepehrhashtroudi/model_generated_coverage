var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":22,"methods":[{"el":33,"sc":3,"sl":30},{"el":44,"sc":3,"sl":35}],"name":"CircularReferenceException","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_127":{"methods":[{"sl":30},{"sl":35}],"name":"testCircularSerialization7","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":41},{"sl":43}]},"test_131":{"methods":[{"sl":30},{"sl":35}],"name":"testSelfReferenceArrayFieldSerialization10","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":41},{"sl":43}]},"test_27":{"methods":[{"sl":30},{"sl":35}],"name":"testSelfReferenceSerialization12","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":41},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [127, 131, 27], [127, 131, 27], [127, 131, 27], [], [], [127, 131, 27], [127, 131, 27], [127, 131, 27], [127, 131, 27], [], [127, 131, 27], [127, 131, 27], [], [127, 131, 27], [], []]
