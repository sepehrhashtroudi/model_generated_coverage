var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":1503,"methods":[{"el":43,"sc":3,"sl":41},{"el":53,"sc":3,"sl":51},{"el":63,"sc":3,"sl":61}],"name":"JsonParseException","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":41},{"sl":61}],"name":"testInvalidJsonDeserializationFails18","pass":true,"statements":[{"sl":42},{"sl":62}]},"test_47":{"methods":[{"sl":61}],"name":"testDefaultJavaSqlTimeDeserialization35","pass":false,"statements":[{"sl":62}]},"test_50":{"methods":[{"sl":51}],"name":"testRawCollectionOfCollectionDeserialization48","pass":false,"statements":[{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [11], [11], [], [], [], [], [], [], [], [], [50], [50], [], [], [], [], [], [], [], [], [47, 11], [47, 11], [], []]
