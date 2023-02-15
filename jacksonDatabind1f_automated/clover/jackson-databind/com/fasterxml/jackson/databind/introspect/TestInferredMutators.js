var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":33997,"methods":[],"name":"TestInferredMutators","sl":8},{"el":14,"id":33997,"methods":[{"el":13,"sc":9,"sl":13}],"name":"TestInferredMutators.Point","sl":10},{"el":22,"id":33999,"methods":[{"el":19,"sc":9,"sl":19},{"el":21,"sc":9,"sl":21}],"name":"TestInferredMutators.FixedPoint","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
