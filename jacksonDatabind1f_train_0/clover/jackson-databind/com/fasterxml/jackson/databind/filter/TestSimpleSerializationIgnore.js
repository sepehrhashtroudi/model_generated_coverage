var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":94,"id":34114,"methods":[],"name":"TestSimpleSerializationIgnore","sl":14},{"el":33,"id":34114,"methods":[{"el":26,"sc":9,"sl":26},{"el":29,"sc":9,"sl":29},{"el":31,"sc":9,"sl":31},{"el":32,"sc":9,"sl":32}],"name":"TestSimpleSerializationIgnore.SizeClassEnabledIgnore","sl":24},{"el":41,"id":34122,"methods":[{"el":39,"sc":9,"sl":39},{"el":40,"sc":9,"sl":40}],"name":"TestSimpleSerializationIgnore.SizeClassDisabledIgnore","sl":36},{"el":50,"id":34126,"methods":[{"el":47,"sc":9,"sl":45},{"el":49,"sc":9,"sl":49}],"name":"TestSimpleSerializationIgnore.BaseClassIgnore","sl":43},{"el":61,"id":34130,"methods":[{"el":60,"sc":9,"sl":58}],"name":"TestSimpleSerializationIgnore.SubClassNonIgnore","sl":52},{"el":64,"id":34132,"methods":[],"name":"TestSimpleSerializationIgnore.IgnoredType","sl":64},{"el":72,"id":34132,"methods":[],"name":"TestSimpleSerializationIgnore.NonIgnoredType","sl":67}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
