var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":85,"id":32857,"methods":[{"el":66,"sc":1,"sl":63},{"el":73,"sc":1,"sl":69}],"name":"TestEmptyClass","sl":9},{"el":12,"id":32857,"methods":[],"name":"TestEmptyClass.Empty","sl":12},{"el":15,"id":32857,"methods":[],"name":"TestEmptyClass.EmptyWithAnno","sl":15},{"el":24,"id":32857,"methods":[{"el":23,"sc":9,"sl":23}],"name":"TestEmptyClass.NonZero","sl":20},{"el":33,"id":32859,"methods":[{"el":32,"sc":9,"sl":30}],"name":"TestEmptyClass.NonZeroWrapper","sl":27},{"el":48,"id":32861,"methods":[{"el":41,"sc":9,"sl":37},{"el":47,"sc":9,"sl":43}],"name":"TestEmptyClass.NonZeroSerializer","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_362":{"methods":[{"sl":23},{"sl":30},{"sl":37},{"sl":43},{"sl":63}],"name":"testCustomNoEmpty18","pass":true,"statements":[{"sl":23},{"sl":31},{"sl":40},{"sl":45},{"sl":46},{"sl":64},{"sl":65}]},"test_413":{"methods":[{"sl":69}],"name":"testEmptyWithFeature412","pass":true,"statements":[{"sl":70},{"sl":71},{"sl":72}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [362], [], [], [], [], [], [], [362], [362], [], [], [], [], [], [362], [], [], [362], [], [], [362], [], [362], [362], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [362], [362], [362], [], [], [], [413], [413], [413], [413], [], [], [], [], [], [], [], [], [], [], [], [], []]
