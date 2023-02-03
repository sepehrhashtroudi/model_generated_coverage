var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":94,"id":39187,"methods":[{"el":65,"sc":1,"sl":60},{"el":72,"sc":1,"sl":68},{"el":79,"sc":1,"sl":75}],"name":"TestTypedDeserializationWithDefault","sl":15},{"el":19,"id":39187,"methods":[],"name":"TestTypedDeserializationWithDefault.Inter","sl":19},{"el":23,"id":39187,"methods":[],"name":"TestTypedDeserializationWithDefault.MyInter","sl":21},{"el":43,"id":39187,"methods":[{"el":42,"sc":9,"sl":27}],"name":"TestTypedDeserializationWithDefault.LegacyInter","sl":25},{"el":47,"id":39199,"methods":[],"name":"TestTypedDeserializationWithDefault.DefaultWithNoClass","sl":47},{"el":51,"id":39199,"methods":[],"name":"TestTypedDeserializationWithDefault.MysteryPolymorphic","sl":51}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_122":{"methods":[{"sl":60}],"name":"testDefaultAsNoClass202","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_309":{"methods":[{"sl":27},{"sl":75}],"name":"testDeserializationWithString269","pass":true,"statements":[{"sl":30},{"sl":36},{"sl":37},{"sl":76},{"sl":77},{"sl":78}]},"test_50":{"methods":[{"sl":27},{"sl":68}],"name":"testDeserializationWithArrayOfSize2207","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":69},{"sl":70},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [50, 309], [], [], [50, 309], [50], [50], [50], [], [], [309], [309], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [122], [122], [122], [122], [122], [], [], [], [50], [50], [50], [50], [], [], [], [309], [309], [309], [309], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
