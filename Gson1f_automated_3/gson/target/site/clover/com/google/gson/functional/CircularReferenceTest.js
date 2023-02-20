var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":90,"id":4465,"methods":[{"el":45,"sc":3,"sl":41},{"el":57,"sc":10,"sl":52},{"el":65,"sc":1,"sl":47}],"name":"CircularReferenceTest","sl":38},{"el":80,"id":4481,"methods":[],"name":"CircularReferenceTest.ContainsReferenceToSelfType","sl":78},{"el":84,"id":4481,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReference","sl":82},{"el":89,"id":4481,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReferenceArray","sl":86}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_28":{"methods":[{"sl":47},{"sl":52}],"name":"testSelfReferenceCustomHandlerSerialization4","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":53},{"sl":54},{"sl":55},{"sl":59},{"sl":60},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28], [28], [28], [28], [], [28], [28], [28], [28], [], [], [], [28], [28], [], [], [28], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
