var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":97,"id":33625,"methods":[{"el":65,"sc":1,"sl":60},{"el":72,"sc":1,"sl":68},{"el":82,"sc":1,"sl":75}],"name":"TestTypedDeserializationWithDefault","sl":15},{"el":19,"id":33625,"methods":[],"name":"TestTypedDeserializationWithDefault.Inter","sl":19},{"el":23,"id":33625,"methods":[],"name":"TestTypedDeserializationWithDefault.MyInter","sl":21},{"el":43,"id":33625,"methods":[{"el":42,"sc":9,"sl":27}],"name":"TestTypedDeserializationWithDefault.LegacyInter","sl":25},{"el":47,"id":33637,"methods":[],"name":"TestTypedDeserializationWithDefault.DefaultWithNoClass","sl":47},{"el":51,"id":33637,"methods":[],"name":"TestTypedDeserializationWithDefault.MysteryPolymorphic","sl":51}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_268":{"methods":[{"sl":27},{"sl":68}],"name":"testDeserializationWithString257","pass":true,"statements":[{"sl":30},{"sl":36},{"sl":37},{"sl":69},{"sl":70},{"sl":71}]},"test_530":{"methods":[{"sl":75}],"name":"testBadTypeAsNull412","pass":true,"statements":[{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81}]},"test_548":{"methods":[{"sl":60}],"name":"testDefaultAsNoClass193","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [268], [], [], [268], [], [], [], [], [], [268], [268], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [548], [548], [548], [548], [548], [], [], [], [268], [268], [268], [268], [], [], [], [530], [530], [530], [530], [530], [530], [530], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
