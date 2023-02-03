var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":78,"id":34096,"methods":[{"el":69,"sc":1,"sl":64}],"name":"TestAnnotationMerging","sl":12},{"el":25,"id":34096,"methods":[{"el":18,"sc":9,"sl":18},{"el":19,"sc":9,"sl":19},{"el":22,"sc":9,"sl":21},{"el":24,"sc":9,"sl":24}],"name":"TestAnnotationMerging.Wrapper","sl":14},{"el":34,"id":34103,"methods":[{"el":31,"sc":9,"sl":31},{"el":33,"sc":9,"sl":33}],"name":"TestAnnotationMerging.SharedName","sl":27},{"el":41,"id":34107,"methods":[{"el":39,"sc":9,"sl":38},{"el":40,"sc":9,"sl":40}],"name":"TestAnnotationMerging.SharedName2","sl":36},{"el":55,"id":34110,"methods":[{"el":53,"sc":9,"sl":48},{"el":54,"sc":9,"sl":54}],"name":"TestAnnotationMerging.TypeWrapper","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_152":{"methods":[{"sl":48},{"sl":54},{"sl":64}],"name":"testSharedTypeInfoWithCtor363","pass":true,"statements":[{"sl":52},{"sl":54},{"sl":65},{"sl":66},{"sl":67},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [152], [], [], [], [152], [], [152], [], [], [], [], [], [], [], [], [], [152], [152], [152], [152], [152], [], [], [], [], [], [], [], [], [], []]
