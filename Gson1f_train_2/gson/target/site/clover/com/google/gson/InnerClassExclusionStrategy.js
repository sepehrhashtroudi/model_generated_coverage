var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":1006,"methods":[{"el":30,"sc":3,"sl":28},{"el":34,"sc":3,"sl":32},{"el":38,"sc":3,"sl":36},{"el":42,"sc":3,"sl":40}],"name":"InnerClassExclusionStrategy","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_137":{"methods":[{"sl":28},{"sl":36},{"sl":40}],"name":"testIncludeStaticNestedClassField210","pass":true,"statements":[{"sl":29},{"sl":37},{"sl":41}]},"test_184":{"methods":[{"sl":32},{"sl":36},{"sl":40}],"name":"testIncludeStaticNestedClassObject211","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41}]},"test_3":{"methods":[{"sl":32},{"sl":36},{"sl":40}],"name":"testInnerClassExclusion183","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [137], [137], [], [], [3, 184], [3, 184], [], [], [137, 3, 184], [137, 3, 184], [], [], [137, 3, 184], [137, 3, 184], [], []]
