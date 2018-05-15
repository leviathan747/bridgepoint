.select many markers from instances of LOCATION_MARKER
.for each m in markers
// ${m.key_letters} ${m.line_attr}, ${m.column_attr}
  .assign ws = "  "
  .if ( "" == m.navigation2 )
select many $l{m.key_letters}s related by self->ACT_BLK[R612]${m.navigation}
  where ( Util::lineAndColumnToPosition( text:param.oldText, line:selected.${m.line_attr}, column:selected.${m.column_attr} ) + param.deltaLength > param.diffEndIndex );
select many committed_$l{m.key_letters}s related by self->ACT_BLK[R601]${m.navigation}
  where ( Util::lineAndColumnToPosition( text:param.oldText, line:selected.${m.line_attr}, column:selected.${m.column_attr} ) + param.deltaLength > param.diffEndIndex );
$l{m.key_letters}s = $l{m.key_letters}s | committed_$l{m.key_letters}s;
for each $l{m.key_letters} in $l{m.key_letters}s
  .else
    .assign ws = "      "
select many $l{m.key_letters}s related by self->ACT_BLK[R612]${m.navigation};
select many committed_$l{m.key_letters}s related by self->ACT_BLK[R601]${m.navigation};
$l{m.key_letters}s = $l{m.key_letters}s | committed_$l{m.key_letters}s;
while ( not_empty $l{m.key_letters}s )
  for each $l{m.key_letters} in $l{m.key_letters}s
    if ( Util::lineAndColumnToPosition( text:param.oldText, line:$l{m.key_letters}.${m.line_attr}, column:$l{m.key_letters}.${m.column_attr} ) + param.deltaLength > param.diffEndIndex )
  .end if
${ws}position = Util::lineAndColumnToPosition( text:param.oldText, line:$l{m.key_letters}.${m.line_attr}, column:$l{m.key_letters}.${m.column_attr} );
  .if ( "" != m.column_attr2 )
${ws}position2 = Util::lineAndColumnToPosition( text:param.oldText, line:$l{m.key_letters}.${m.line_attr}, column:$l{m.key_letters}.${m.column_attr2} );
  .end if
${ws}$l{m.key_letters}.${m.line_attr} = Util::positionToLine( text:param.bodyText, position:position + param.deltaLength );
${ws}$l{m.key_letters}.${m.column_attr} = Util::positionToColumn( text:param.bodyText, position:position + param.deltaLength );
  .if ( "" != m.column_attr2 )
${ws}$l{m.key_letters}.${m.column_attr2} = Util::positionToColumn( text:param.bodyText, position:position2 + param.deltaLength );
  .end if
  .if ( "" == m.navigation2 )
end for;
  .else
    end if;
  end for;
  select many $l{m.key_letters}s related by $l{m.key_letters}s${m.navigation2};
end while;
  .end if

.end for
.emit to file "reconcileLocations.oal"
