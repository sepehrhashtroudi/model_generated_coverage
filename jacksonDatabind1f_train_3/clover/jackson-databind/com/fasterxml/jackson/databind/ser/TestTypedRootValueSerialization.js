var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":31021,"methods":[{"el":34,"sc":1,"sl":27},{"el":44,"sc":1,"sl":37}],"name":"TestTypedRootValueSerialization","sl":9},{"el":14,"id":31021,"methods":[],"name":"TestTypedRootValueSerialization.Issue822Interface","sl":12},{"el":23,"id":31021,"methods":[{"el":21,"sc":9,"sl":20},{"el":22,"sc":9,"sl":22}],"name":"TestTypedRootValueSerialization.Issue822Impl","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_396":{"methods":[{"sl":20},{"sl":27}],"name":"testTypedMaps13","pass":true,"statements":[{"sl":21},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":33}]},"test_81":{"methods":[{"sl":20},{"sl":37}],"name":"testTypedLists552","pass":true,"statements":[{"sl":21},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [396, 81], [396, 81], [], [], [], [], [], [396], [396], [396], [396], [396], [], [396], [], [], [], [81], [81], [81], [81], [81], [], [81], [], [], [], [], [], [], [], [], [], [], [], []]
