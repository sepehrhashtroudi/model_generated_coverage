var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":40238,"methods":[{"el":45,"sc":1,"sl":37}],"name":"TestIgnoredTypes","sl":10},{"el":21,"id":40238,"methods":[{"el":20,"sc":9,"sl":20}],"name":"TestIgnoredTypes.IgnoredType","sl":19},{"el":28,"id":40239,"methods":[],"name":"TestIgnoredTypes.NonIgnoredType","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_545":{"methods":[{"sl":37}],"name":"testIgnoredType384","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [545], [545], [545], [545], [545], [545], [545], [545], [], [], [], []]
