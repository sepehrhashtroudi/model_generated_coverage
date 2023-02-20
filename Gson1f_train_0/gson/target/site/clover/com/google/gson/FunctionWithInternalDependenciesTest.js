var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":4001,"methods":[{"el":42,"sc":1,"sl":38}],"name":"FunctionWithInternalDependenciesTest","sl":35},{"el":65,"id":4005,"methods":[{"el":55,"sc":5,"sl":53},{"el":59,"sc":5,"sl":57},{"el":63,"sc":5,"sl":61}],"name":"FunctionWithInternalDependenciesTest.UserDefinedExclusionStrategy","sl":50}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_53":{"methods":[{"sl":38},{"sl":53},{"sl":57},{"sl":61}],"name":"testUserDefinedExclusionPolicies182","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41},{"sl":54},{"sl":58},{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [53], [53], [53], [53], [], [], [], [], [], [], [], [], [], [], [], [53], [53], [], [], [53], [53], [], [], [53], [53], [], [], [], []]
