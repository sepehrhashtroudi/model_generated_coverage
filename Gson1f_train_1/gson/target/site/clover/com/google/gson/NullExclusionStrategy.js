var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":2120,"methods":[{"el":32,"sc":3,"sl":30},{"el":36,"sc":3,"sl":34}],"name":"NullExclusionStrategy","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_140":{"methods":[{"sl":30}],"name":"testNeverSkipsField168","pass":true,"statements":[{"sl":31}]},"test_18":{"methods":[{"sl":34}],"name":"testNeverSkipsClass169","pass":true,"statements":[{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [140], [140], [], [], [18], [18], [], []]
