var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":87,"id":33258,"methods":[],"name":"TestConversions","sl":19},{"el":23,"id":33258,"methods":[],"name":"TestConversions.Root","sl":21},{"el":30,"id":33258,"methods":[{"el":28,"sc":9,"sl":28},{"el":29,"sc":9,"sl":29}],"name":"TestConversions.Leaf","sl":25},{"el":36,"id":33261,"methods":[],"name":"TestConversions.LeafMixIn","sl":34},{"el":62,"id":33261,"methods":[{"el":61,"sc":9,"sl":53}],"name":"TestConversions.LeafDeserializer","sl":51},{"el":72,"id":33266,"methods":[],"name":"TestConversions.Issue709Bean","sl":70}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
