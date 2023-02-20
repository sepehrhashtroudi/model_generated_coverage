var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":74,"id":1980,"methods":[{"el":47,"sc":3,"sl":45},{"el":57,"sc":3,"sl":55}],"name":"LongSerializationPolicy","sl":27},{"el":61,"id":1984,"methods":[],"name":"LongSerializationPolicy.Strategy","sl":59},{"el":67,"id":1984,"methods":[{"el":66,"sc":5,"sl":64}],"name":"LongSerializationPolicy.DefaultStrategy","sl":63},{"el":73,"id":1986,"methods":[{"el":72,"sc":5,"sl":70}],"name":"LongSerializationPolicy.StringStrategy","sl":69}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_21":{"methods":[{"sl":45},{"sl":55},{"sl":70}],"name":"testStringLongSerialization81","pass":true,"statements":[{"sl":46},{"sl":56},{"sl":71}]},"test_39":{"methods":[{"sl":55},{"sl":64}],"name":"testReadWriteTwoObjects60","pass":true,"statements":[{"sl":56},{"sl":65}]},"test_6":{"methods":[{"sl":55},{"sl":64}],"name":"testGsonAcceptsEscapedAndNonEscapedJsonDeserialization58","pass":true,"statements":[{"sl":56},{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [21], [21], [], [], [], [], [], [], [], [], [6, 21, 39], [6, 21, 39], [], [], [], [], [], [], [], [6, 39], [6, 39], [], [], [], [], [21], [21], [], [], []]
