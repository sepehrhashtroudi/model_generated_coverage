var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":32121,"methods":[{"el":34,"sc":1,"sl":27},{"el":44,"sc":1,"sl":37}],"name":"TestTypedRootValueSerialization","sl":9},{"el":14,"id":32121,"methods":[],"name":"TestTypedRootValueSerialization.Issue822Interface","sl":12},{"el":23,"id":32121,"methods":[{"el":21,"sc":9,"sl":20},{"el":22,"sc":9,"sl":22}],"name":"TestTypedRootValueSerialization.Issue822Impl","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_394":{"methods":[{"sl":20},{"sl":37}],"name":"testTypedLists552","pass":true,"statements":[{"sl":21},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":43}]},"test_546":{"methods":[{"sl":20},{"sl":27}],"name":"testTypedMaps10","pass":true,"statements":[{"sl":21},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [394, 546], [394, 546], [], [], [], [], [], [546], [546], [546], [546], [546], [], [546], [], [], [], [394], [394], [394], [394], [394], [], [394], [], [], [], [], [], [], [], [], [], [], [], []]
