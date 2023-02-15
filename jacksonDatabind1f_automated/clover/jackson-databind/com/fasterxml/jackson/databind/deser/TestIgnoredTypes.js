var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":33992,"methods":[],"name":"TestIgnoredTypes","sl":10},{"el":21,"id":33992,"methods":[{"el":20,"sc":9,"sl":20}],"name":"TestIgnoredTypes.IgnoredType","sl":19},{"el":28,"id":33993,"methods":[],"name":"TestIgnoredTypes.NonIgnoredType","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
