var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":4266,"methods":[{"el":33,"sc":3,"sl":30},{"el":37,"sc":3,"sl":35},{"el":41,"sc":3,"sl":39}],"name":"MockExclusionStrategy","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_147":{"methods":[{"sl":35},{"sl":39}],"name":"testSkipFieldsWithFalseOnly161","pass":true,"statements":[{"sl":36},{"sl":40}]},"test_62":{"methods":[{"sl":35},{"sl":39}],"name":"testSkipFieldsWithMixedTrueAndFalse162","pass":true,"statements":[{"sl":36},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [62, 147], [62, 147], [], [], [62, 147], [62, 147], [], []]
