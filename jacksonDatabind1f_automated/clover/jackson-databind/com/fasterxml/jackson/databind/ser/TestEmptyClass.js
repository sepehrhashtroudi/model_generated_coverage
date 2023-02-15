var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":33774,"methods":[],"name":"TestEmptyClass","sl":9},{"el":12,"id":33774,"methods":[],"name":"TestEmptyClass.Empty","sl":12},{"el":15,"id":33774,"methods":[],"name":"TestEmptyClass.EmptyWithAnno","sl":15},{"el":24,"id":33774,"methods":[{"el":23,"sc":9,"sl":23}],"name":"TestEmptyClass.NonZero","sl":20},{"el":33,"id":33776,"methods":[{"el":32,"sc":9,"sl":30}],"name":"TestEmptyClass.NonZeroWrapper","sl":27},{"el":48,"id":33778,"methods":[{"el":41,"sc":9,"sl":37},{"el":47,"sc":9,"sl":43}],"name":"TestEmptyClass.NonZeroSerializer","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
