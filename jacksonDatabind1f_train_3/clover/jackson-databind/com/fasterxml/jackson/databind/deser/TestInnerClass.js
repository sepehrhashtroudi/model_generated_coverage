var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":34544,"methods":[{"el":46,"sc":1,"sl":35}],"name":"TestInnerClass","sl":5},{"el":26,"id":34544,"methods":[{"el":13,"sc":7,"sl":13},{"el":18,"sc":7,"sl":14}],"name":"TestInnerClass.Dog","sl":8},{"el":25,"id":34549,"methods":[{"el":24,"sc":11,"sl":24}],"name":"TestInnerClass.Dog.Brain","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_132":{"methods":[{"sl":13},{"sl":14},{"sl":24},{"sl":35}],"name":"testSimpleNonStaticInner369","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":24},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [132], [132], [132], [132], [132], [], [], [], [], [], [], [132], [], [], [], [], [], [], [], [], [], [], [132], [132], [132], [132], [132], [132], [132], [132], [132], [132], [132], [], [], [], []]
