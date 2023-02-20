var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":115,"id":4881,"methods":[{"el":45,"sc":3,"sl":41},{"el":57,"sc":1,"sl":48},{"el":68,"sc":1,"sl":60},{"el":81,"sc":10,"sl":76},{"el":89,"sc":1,"sl":71}],"name":"CircularReferenceTest","sl":38},{"el":105,"id":4910,"methods":[],"name":"CircularReferenceTest.ContainsReferenceToSelfType","sl":103},{"el":109,"id":4910,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReference","sl":107},{"el":114,"id":4910,"methods":[],"name":"CircularReferenceTest.ClassWithSelfReferenceArray","sl":111}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_12":{"methods":[{"sl":60}],"name":"testSelfReferenceSerialization11","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_177":{"methods":[{"sl":48}],"name":"testSelfReferenceArrayFieldSerialization9","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":55}]},"test_30":{"methods":[{"sl":71},{"sl":76}],"name":"testSelfReferenceCustomHandlerSerialization13","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":77},{"sl":78},{"sl":79},{"sl":83},{"sl":84},{"sl":87}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [177], [177], [177], [177], [177], [], [], [177], [], [], [], [], [12], [12], [12], [12], [12], [], [], [], [], [], [], [30], [30], [30], [30], [], [30], [30], [30], [30], [], [], [], [30], [30], [], [], [30], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
