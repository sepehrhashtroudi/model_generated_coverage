var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":22227,"methods":[{"el":22,"sc":5,"sl":22},{"el":36,"sc":5,"sl":30},{"el":54,"sc":5,"sl":38}],"name":"NullifyingDeserializer","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_530":{"methods":[{"sl":30}],"name":"testBadTypeAsNull412","pass":true,"statements":[{"sl":34},{"sl":35}]},"test_548":{"methods":[{"sl":22},{"sl":30}],"name":"testDefaultAsNoClass193","pass":true,"statements":[{"sl":22},{"sl":34},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [548], [], [], [], [], [], [], [], [530, 548], [], [], [], [530, 548], [530, 548], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
