var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":35044,"methods":[],"name":"TestAnnotationMerging","sl":12},{"el":25,"id":35044,"methods":[{"el":18,"sc":9,"sl":18},{"el":19,"sc":9,"sl":19},{"el":22,"sc":9,"sl":21},{"el":24,"sc":9,"sl":24}],"name":"TestAnnotationMerging.Wrapper","sl":14},{"el":34,"id":35051,"methods":[{"el":31,"sc":9,"sl":31},{"el":33,"sc":9,"sl":33}],"name":"TestAnnotationMerging.SharedName","sl":27},{"el":41,"id":35055,"methods":[{"el":39,"sc":9,"sl":38},{"el":40,"sc":9,"sl":40}],"name":"TestAnnotationMerging.SharedName2","sl":36},{"el":55,"id":35058,"methods":[{"el":53,"sc":9,"sl":48},{"el":54,"sc":9,"sl":54}],"name":"TestAnnotationMerging.TypeWrapper","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
