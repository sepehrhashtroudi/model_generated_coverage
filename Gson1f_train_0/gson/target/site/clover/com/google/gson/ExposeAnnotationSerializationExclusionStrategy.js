var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":605,"methods":[{"el":31,"sc":3,"sl":29},{"el":39,"sc":3,"sl":33}],"name":"ExposeAnnotationSerializationExclusionStrategy","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_111":{"methods":[{"sl":33}],"name":"testSkipExplicitlySkippedFields117","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":38}]},"test_144":{"methods":[{"sl":33}],"name":"testSkipNonAnnotatedFields118","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [111, 144], [111, 144], [111, 144], [144], [], [111], [], []]
