var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":4479,"methods":[{"el":45,"sc":3,"sl":41},{"el":55,"sc":1,"sl":47}],"name":"CircularReferenceTest","sl":38},{"el":70,"id":4488,"methods":[],"name":"CircularReferenceTest.ContainsReferenceToSelfType","sl":68},{"el":74,"id":4488,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReference","sl":72},{"el":79,"id":4488,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReferenceArray","sl":76}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":47}],"name":"testSelfReferenceSerialization3","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [11], [11], [11], [11], [11], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
