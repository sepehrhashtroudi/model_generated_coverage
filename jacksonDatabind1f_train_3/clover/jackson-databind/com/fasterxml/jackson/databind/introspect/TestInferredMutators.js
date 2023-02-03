var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":36602,"methods":[{"el":42,"sc":1,"sl":32}],"name":"TestInferredMutators","sl":8},{"el":14,"id":36602,"methods":[{"el":13,"sc":9,"sl":13}],"name":"TestInferredMutators.Point","sl":10},{"el":22,"id":36604,"methods":[{"el":19,"sc":9,"sl":19},{"el":21,"sc":9,"sl":21}],"name":"TestInferredMutators.FixedPoint","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_186":{"methods":[{"sl":19},{"sl":32}],"name":"testFinalFieldIgnoral188","pass":true,"statements":[{"sl":19},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [186], [], [], [], [], [], [], [], [], [], [], [], [], [186], [186], [186], [186], [186], [186], [], [], [186], [], [], [], [], [], [], [], []]
