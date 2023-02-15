var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":104,"id":32808,"methods":[{"el":89,"sc":1,"sl":80}],"name":"TestSimpleSerializationIgnore","sl":14},{"el":33,"id":32808,"methods":[{"el":26,"sc":9,"sl":26},{"el":29,"sc":9,"sl":29},{"el":31,"sc":9,"sl":31},{"el":32,"sc":9,"sl":32}],"name":"TestSimpleSerializationIgnore.SizeClassEnabledIgnore","sl":24},{"el":41,"id":32816,"methods":[{"el":39,"sc":9,"sl":39},{"el":40,"sc":9,"sl":40}],"name":"TestSimpleSerializationIgnore.SizeClassDisabledIgnore","sl":36},{"el":50,"id":32820,"methods":[{"el":47,"sc":9,"sl":45},{"el":49,"sc":9,"sl":49}],"name":"TestSimpleSerializationIgnore.BaseClassIgnore","sl":43},{"el":61,"id":32824,"methods":[{"el":60,"sc":9,"sl":58}],"name":"TestSimpleSerializationIgnore.SubClassNonIgnore","sl":52},{"el":64,"id":32826,"methods":[],"name":"TestSimpleSerializationIgnore.IgnoredType","sl":64},{"el":72,"id":32826,"methods":[],"name":"TestSimpleSerializationIgnore.NonIgnoredType","sl":67}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_83":{"methods":[{"sl":49},{"sl":58},{"sl":80}],"name":"testIgnoreOver256","pass":true,"statements":[{"sl":49},{"sl":60},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [83], [], [], [], [], [], [], [], [], [83], [], [83], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [83], [83], [83], [83], [83], [83], [83], [83], [83], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
