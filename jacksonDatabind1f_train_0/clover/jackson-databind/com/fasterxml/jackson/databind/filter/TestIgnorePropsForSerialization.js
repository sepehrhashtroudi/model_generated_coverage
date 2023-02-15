var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":83,"id":32656,"methods":[],"name":"TestIgnorePropsForSerialization","sl":9},{"el":26,"id":32656,"methods":[{"el":24,"sc":9,"sl":24},{"el":25,"sc":9,"sl":25}],"name":"TestIgnorePropsForSerialization.IgnoreSome","sl":19},{"el":30,"id":32660,"methods":[],"name":"TestIgnorePropsForSerialization.MyMap","sl":30},{"el":37,"id":32660,"methods":[],"name":"TestIgnorePropsForSerialization.WrapperWithPropIgnore","sl":33},{"el":42,"id":32660,"methods":[],"name":"TestIgnorePropsForSerialization.XY","sl":39},{"el":48,"id":32660,"methods":[],"name":"TestIgnorePropsForSerialization.WrapperWithPropIgnore2","sl":44},{"el":55,"id":32660,"methods":[],"name":"TestIgnorePropsForSerialization.XYZ","sl":51},{"el":64,"id":32660,"methods":[{"el":63,"sc":9,"sl":60}],"name":"TestIgnorePropsForSerialization.MapWrapper","sl":57}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
