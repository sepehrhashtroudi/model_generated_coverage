var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":34676,"methods":[{"el":60,"sc":1,"sl":50}],"name":"TestAnyGetter","sl":11},{"el":31,"id":34676,"methods":[{"el":25,"sc":9,"sl":23},{"el":27,"sc":9,"sl":27},{"el":30,"sc":9,"sl":29}],"name":"TestAnyGetter.Bean","sl":20},{"el":41,"id":34682,"methods":[{"el":40,"sc":9,"sl":35}],"name":"TestAnyGetter.AnyOnlyBean","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_203":{"methods":[{"sl":35},{"sl":50}],"name":"testAnyOnly336","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [203], [], [203], [203], [203], [], [], [], [], [], [], [], [], [], [], [203], [203], [203], [203], [203], [203], [203], [203], [203], [203], [], [], [], [], [], [], []]
