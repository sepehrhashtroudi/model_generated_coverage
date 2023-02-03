var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":117,"id":4851,"methods":[{"el":45,"sc":3,"sl":41},{"el":59,"sc":1,"sl":48},{"el":70,"sc":1,"sl":62},{"el":83,"sc":10,"sl":78},{"el":91,"sc":1,"sl":73}],"name":"CircularReferenceTest","sl":38},{"el":107,"id":4882,"methods":[],"name":"CircularReferenceTest.ContainsReferenceToSelfType","sl":105},{"el":111,"id":4882,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReference","sl":109},{"el":116,"id":4882,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReferenceArray","sl":113}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_165":{"methods":[{"sl":62}],"name":"testSelfReferenceSerialization9","pass":true,"statements":[{"sl":63},{"sl":64},{"sl":65},{"sl":66}]},"test_50":{"methods":[{"sl":48}],"name":"testCircularSerialization5","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":57}]},"test_93":{"methods":[{"sl":73},{"sl":78}],"name":"testSelfReferenceCustomHandlerSerialization11","pass":true,"statements":[{"sl":74},{"sl":75},{"sl":76},{"sl":79},{"sl":80},{"sl":81},{"sl":85},{"sl":86},{"sl":89}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [50], [50], [50], [50], [50], [50], [50], [], [], [50], [], [], [], [], [165], [165], [165], [165], [165], [], [], [], [], [], [], [93], [93], [93], [93], [], [93], [93], [93], [93], [], [], [], [93], [93], [], [], [93], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
